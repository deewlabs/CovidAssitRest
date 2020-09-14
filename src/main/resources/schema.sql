create table Hospitals
(
  HospitalId INTEGER PRIMARY KEY AUTO_INCREMENT,
  HospitalName varchar(200) not null,
  HospitalAddress varchar(300) not null,
  Lattitude double,
  Longitude double,
  Locality varchar(100),
  TotalICU integer,
  TotalVentilator integer,
  TotalAmbulance integer,
  AvailableICU integer,
  AvailableVentilator integer,
  AvailableAmbulance integer
);


create table PastMedicalCondition(
    PastMedConId INTEGER  PRIMARY KEY AUTO_INCREMENT,
    MedCon varchar(20) not null,
    Severity varchar(20),
    ICURequired varchar(5),
    VentilationRequired varchar(5)
);

create table CovidSymptons
(
  SymptonId INTEGER PRIMARY KEY AUTO_INCREMENT,
  Symptons varchar(100),
  severity varchar(20)
);

create table PatientInfo(
  PatientId INTEGER PRIMARY KEY AUTO_INCREMENT,
  FirstName varchar(100),
  LastName varchar(100),
  Age integer,
  Sex char(1),
  AddressLine1 varchar(200),
  AddressLine2 varchar(200),
  Lattitude double,
  Longitude double,
  PastMedConId INTEGER,
  SymptonId INTEGER,
  foreign key (PastMedConId)  references  PastMedicalCondition(PastMedConId),
  foreign key (SymptonId)  references  CovidSymptons(SymptonId)
  
);
