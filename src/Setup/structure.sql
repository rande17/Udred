--Address, dropping the the table exists

DROP TABLE IF EXISTS Address;

--Address, create the table

CREATE TABLE Address (
zipCode integer,
city text,
street text,
houseNumber text,
UUID text PRIMARY KEY
);

--Guardian, drop table if exists

DROP TABLE IF EXISTS Guardian;

--Guardian, create table

CREATE TABLE Guardian (
guardianName text,
guardianCPR text PRIMARY KEY,
guardianAddress text,
guardianTelephone bigint,
UUID text
);

--PartsRepresentive, drop table if exists

DROP TABLE IF EXISTS PartsRepresentive;

--PartsRepresentive, create Table

CREATE TABLE PartsRepresentive (
partRepresentiveName text,
partRepresentiveAddress text,
partRepresentiveCPR text,
partRepresentiveTelephone bigint,
partRepresentiveUUID text PRIMARY KEY
);

DROP TABLE IF EXISTS Patient;

CREATE TABLE Patient (
patientName text,
patientAddressID text,
patientTelephone integer,
patientCPR bigint,
patientGuardianID text,
patientID text PRIMARY KEY
);

DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
userName text,
workerID integer PRIMARY KEY,
caseList text,
accessLevel int 
);

DROP TABLE IF EXISTS Assessor;

CREATE TABLE Assessor (
assessorName text,
assessorTelephone bigint,
function text,
assessorUUID text PRIMARY KEY
);

DROP TABLE IF EXISTS InquiryInformation;

CREATE TABLE InquiryInformation (
Date date,
UUID text,
inquiry text
);

DROP TABLE IF EXISTS AlternativeInformation;

CREATE TABLE AlternativeInformation(
type text,
title text,
subject text,
informationConsent text,
UUID text,
time date,
content text
);

DROP TABLE IF EXISTS CaseInformation;

CREATE TABLE CaseInformation(
inquiryInformation text,
consentList text,
AlternateInfomationList text,
UUID text PRIMARY KEY,
diary text 
);

DROP TABLE IF EXISTS DiaryEntry;

CREATE TABLE DiaryEntry (
timestamp date,
topic text,
content text,
UUID text PRIMARY KEY,
type text
);

DROP TABLE IF EXISTS Meeting;

CREATE TABLE Meeting(
meetingTime date,
patient text,
meetingAddress text,
partRepresentative text,
MeetingUUID text PRIMARY KEY
);

DROP TABLE IF EXISTS Cases;

CREATE TABLE Cases (
caseType text,
UUID text PRIMARY KEY,
caseID text,
status text,
patient text,
caseWorker text,
creationDate date DEFAULT NOW(),
closingDate date,
consent text,
caseInformation text
);