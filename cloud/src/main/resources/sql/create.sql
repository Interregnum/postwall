CREATE TABLE email
(
	id					INT				AUTO_INCREMENT,
	primary_email		VARCHAR(100) 	NOT NULL,
	alternative_email	VARCHAR(100),
	PRIMARY KEY (id),
	UNIQUE (primary_email)
);

CREATE TABLE security_question
(
	id			INT				AUTO_INCREMENT,
	question	VARCHAR(500)	NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (question)
);

CREATE TABLE phone
(
	id			INT				AUTO_INCREMENT,
	type		VARCHAR(10)		DEFAULT 'Undefined',
	number		VARCHAR(20)		NOT NULL,
	isPrimary	BOOLEAN			DEFAULT false,
	PRIMARY KEY (id),
	UNIQUE (number)
);

CREATE TABLE address
(
	id				INT 			AUTO_INCREMENT,
	alias			VARCHAR(100)	DEFAULT 'Undefined',
	address_line_1	VARCHAR(250) 	NOT NULL,
	address_line_2	VARCHAR(250),
	city			VARCHAR(100) 	NOT NULL,
	state			VARCHAR(100) 	NOT NULL,
	postal_code		VARCHAR(20) 	NOT NULL,
	country			VARCHAR(100) 	NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (address_line_1, address_line_2, city, state, postal_code, country)
);

CREATE TABLE credential
(
	user_id 			INT				AUTO_INCREMENT,
	username 			VARCHAR(100)	NOT NULL,
	password 			VARCHAR(100)	NOT NULL,
	email_id 			INT				NOT NULL,
	security_question_1 INT				NOT NULL,
	security_answer_1 	VARCHAR(200)	NOT NULL,
	security_question_2 INT				NOT NULL,
	security_answer_2 	VARCHAR(200)	NOT NULL,
	PRIMARY KEY (user_id),
	UNIQUE (username),
	UNIQUE (email_id),
	FOREIGN KEY (email_id) REFERENCES email(id),
	FOREIGN KEY (security_question_1) REFERENCES security_question(id),
	FOREIGN KEY (security_question_2) REFERENCES security_question(id)
);

CREATE TABLE contact
(
	user_id		INT		NOT NULL,
	phone_id	INT,
	address_id	INT,
	email_id	INT 	NOT NULL,
	UNIQUE (user_id, phone_id, address_id, email_id),
	FOREIGN KEY (user_id) REFERENCES credential(user_id),
	FOREIGN KEY (phone_id) REFERENCES phone(id),
	FOREIGN KEY (address_id) REFERENCES address(id),
	FOREIGN KEY (email_id) REFERENCES email(id)
);