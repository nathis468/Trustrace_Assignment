CREATE DATABASE Online_Bookstore;

USE Online_Bookstore;

CREATE TABLE Author(
	AuthorName VARCHAR(30) ,
	Address VARCHAR(100),
	URL VARCHAR(200),
    	PRIMARY KEY (AuthorName,Address)
);

CREATE TABLE Publisher(
	PublisherName VARCHAR(30) PRIMARY KEY,
	Address VARCHAR(100),
	Phone INT,
	URL VARCHAR(200)
);

 CREATE TABLE Customer(
 	Email VARCHAR(30) PRIMARY KEY,
 	Name VARCHAR(30),
 	Phone INT,
 	Address VARCHAR(100)
 );
 
 CREATE TABLE Item(
 	ItemId VARCHAR(10) PRIMARY KEY,
 	ItemName VARCHAR(30),
 	ItemType VARCHAR(30)
 );
 
 CREATE TABLE Book(
 	ISBN VARCHAR(10) PRIMARY KEY,
 	Title VARCHAR(30),
 	Year INT,
 	Price INT,
 	ItemId VARCHAR(10),
 	AuthorName VARCHAR(30),
 	PublisherName VARCHAR(30),
 	FOREIGN KEY (ItemId) REFERENCES Item (ItemId),
	FOREIGN KEY (AuthorName) REFERENCES Author (AuthorName),
	FOREIGN KEY (PublisherName) REFERENCES Publisher (PublisherName)
 ); 	
 
 CREATE TABLE MusicCassettes(
 	CassetteId VARCHAR(10) PRIMARY KEY,
 	Title VARCHAR(30),
 	Year INT,
 	Price  INT,
 	ItemId VARCHAR(10),
 	AuthorName VARCHAR(30),
 	PublisherName VARCHAR(30),
 	FOREIGN KEY (ItemId) REFERENCES Item (ItemId),
 	FOREIGN KEY (AuthorName) REFERENCES Author (AuthorName),
	FOREIGN KEY (PublisherName) REFERENCES Publisher (PublisherName)
);
 
 CREATE TABLE CompactDisk(
 	DiskId VARCHAR(10) PRIMARY KEY,
 	Tile VARCHAR(30),
 	Year INT,
 	Price INT,
 	ItemId VARCHAR(10),
 	AuthorName VARCHAR(30),
 	PublisherName VARCHAR(30),
 	FOREIGN KEY (ItemId) REFERENCES Item (ItemId),
 	FOREIGN KEY (AuthorName) REFERENCES Author (AuthorName),
	FOREIGN KEY (PublisherName) REFERENCES Publisher (PublisherName)
);
 		
 	
 CREATE TABLE Basket(
 	BasketId VARCHAR(10) PRIMARY KEY,
 	Email VARCHAR(30),
 	FOREIGN KEY (Email) REFERENCES Customer (Email)
 );
 
 CREATE TABLE Warehouse(
 	Code INT PRIMARY KEY,
 	Phone INT,
 	Address VARCHAR(100),
 	ISBN VARCHAR(10),
 	FOREIGN KEY (ISBN) REFERENCES Book(ISBN) 
 );
 
 
