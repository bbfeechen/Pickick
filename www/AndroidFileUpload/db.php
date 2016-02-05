<?php

$servername = "localhost";
$username = "root";
$password = "";

function connect_db(){
	$connect = mysql_connect("localhost:8080", "root", "");
	// Check connection
	if ($conn->connect_error) {
    	die("Connection failed: " . $conn->connect_error);
   		return null;
	} 
	// Create database
	$sql = "CREATE DATABASE IF NOT EXISTS pickick";
	if ($connect->query($sql) === TRUE) {
	    echo "Database created successfully";
	} else {
	    echo "Error creating database: " . $conn->error;
	}

	echo "Connected successfully";
	return $connect;
}

function close_db($connect){
	$connect->close();
}

function is_connected($connect){
	if (!mysql_ping($connect)) {
    	echo 'Lost connection, exiting after query #1';
    	return false;
	}
	return true;
}

function create_table($connect){
	if(!is_connected){
		$connect = connect_db();
		return false;
	}

	$createUsersSql= "CREATE TABLE users (
		id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
		username VARCHAR(60) NOT NULL,
		email VARCHAR(50),
		reg_date TIMESTAMP)";

	$createPicsSql = "CREATE TABLE MyGuests (
		id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
		nickname VARCHAR(30) NOT NULL,
		location VARCHAR(100) NOT NULL,
		userid INT,
		FOREIGN KEY(userid) REFERENCES users(id)";

}



?>