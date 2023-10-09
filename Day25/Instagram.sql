create database Day25_Instagram;

use Day25_Instagram;

create table users(
	user_id varchar(10) primary key,
	email varchar(20),
	verified bool,
	phnumber varchar(10),
	DOB varchar(20),
	pwd text
);

create table pages(
	page_id varchar(10) primary key,
	user_id varchar(10),
	page_name text,
	page_handle text,
	Bio text,
	DP text,
	Avatar text,
	pwd text,
	DOB varchar(20),
	page_privacy varchar(10),
	foreign key(user_id) references users(user_id)
);

create table followdetails(
	followers varchar(10),
	following varchar(10),
	foreign key(followers) references pages(page_id),
	foreign key(following) references pages(page_id)
);

create table chat(
	chat_id varchar(10) primary key,
	chat_type varchar(10),
	vanish_mode boolean,
	settings varchar(50)
);


create table message(
	message_id varchar(10) primary key,
	content varchar(200),
	sender varchar(10),
	Time time,
	chat_id varchar(10),
	isVanishMode boolean,
	foreign key(chat_id) references chat(chat_id),
	foreign key(sender) references pages(page_id)
);


create table chat_details(
	chat_id varchar(10),
	page_id varchar(10),
	isAdmin boolean,
	lastReadMessage_Id int,
	foreign key(chat_id) references chat(chat_id),
	foreign key(page_id) references pages(page_id)
);

create table device(
	device_id varchar(10) primary key,
	page_id varchar(10),
	device_location varchar(50),
	login_time time,
	logout_time time,
	cookie varchar(200),
	foreign key(page_id) references pages(page_id)
);


create table content(
	post_id varchar(10) primary key,
	page_id varchar(10),
	Post_Media varchar(20),
	Media_type varchar(20),
	Music_Id varchar(10),
	Views int8,
	Primary_Poster varchar(20),
	Likes int8,
	Caption text,
	Date_and_Time datetime,
	Location varchar(25),
	Music_Id_Timestamp timestamp,
	foreign key(page_id) references pages(page_id)
);

create table comments(
	comment_id varchar(10) primary key,
	post_id varchar(10),
	content varchar(100),
	parent_comment_id varchar(10),
	foreign key(post_id) references content(post_id),
	foreign key(parent_comment_id) references comments(comment_id)
);

create table collab_post(
	post_id varchar(10),
	page_id varchar(10),
	foreign key(post_id) references content(post_id),
	foreign key(page_id) references pages(page_id)
);

create table likes(
	page_id varchar(10),
	post_id varchar(10),
	comment_id varchar(10),
	foreign key(post_id) references content(post_id),
	foreign key(page_id) references pages(page_id),
	foreign key(comment_id) references comments(comment_id)
);

create table stories(
	story_id varchar(10) primary key,
	content_id varchar(10),
	liked_page_id varchar(10),
	foreign key(content_id) references content(post_id),
	foreign key(liked_page_id) references pages(page_id)
);

create table ref_stories(
	Coordinates text, 
	story_id varchar(10),
	story_text text,
	foreign key(story_id) references stories(story_id)
);

create table Music(
	Music_id varchar(10) primary key,
	post_id varchar(10),
	Title varchar(100),
	Artist char(40),
	Lyrics char(100),
	Thumbnail char(100),
	foreign key(post_id) references content(post_id)
);

create table Collection(
	collection_id varchar(10) primary key,
	collection_Name char(100),
	page_id varchar(10),
	foreign key(page_id) references pages(page_id)
);


create table Collab(
	Collab_id varchar(10) primary key,
	page_id varchar(10),
	Is_Owner bool,
	foreign key(page_id) references pages(page_id)
);

create table Saved(
	post_id varchar(10),
	Collab_id varchar(10),
	collection_id varchar(10),
	foreign key(post_id) references content(post_id),
	foreign key(Collab_id) references Collab(Collab_id),
	foreign key(collection_id) references Collection(collection_id)
);


create table Post(
	Media_id varchar(10) primary key,
	post_id varchar(10),
	Media_Link varchar(100),
	foreign key(post_id) references content(post_id)
);

create table Tags(
	Tag_id varchar(10) primary key,
	coords varchar(100),
	Media_id  varchar(10),
	page_id  varchar(10),
	foreign key(page_id) references pages(page_id),
	foreign key(Media_id) references Post(Media_id)
);


create table Hashtags(
	post_id varchar(10) ,
	hashtag varchar(40),
	hashcount int,
	primary key(post_id,hashtag),
	foreign key(post_id) references Post(post_id)
);