create table Hospitals
(
  HospitalId INTEGER PRIMARY KEY AUTO_INCREMENT,
  HospitalName varchar(200) not null,
  HospitalAddress varchar(300) not null,
  Lattitude double,
  Longitude double,
  ContactNo varchar(20),
  EmailId varchar(100),
  AmbulanceServiceAvailable varchar(10),
  TotalAmbulance integer,
  AvailableAmbulance integer,
  TotalIsolationBed integer,
  AvailableIsolationBed integer,
  TotalICU integer,
  AvailableICU integer,
  TotalOxygenUnit integer,
  AvailableOxygenUnit integer,
  TotalVentilator integer,
  AvailableVentilator integer,
  Url varchar(180)
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
  Name varchar(100),
  Age integer,
  Sex char(1),
  Address varchar(500),
  Lattitude double,
  Longitude double,
  ContactNo varchar(20),
  EmergencyContactNo varchar(20),
  EmailId varchar(100),
  MedicalCondition varchar(40),
  CovidSympton varchar(40),
  Severity varchar(10),
  AmbulanceRequired varchar(5),
  HospitalRequired varchar(5),
  InternationalTravel varchar(5)
  
);

create table CAServiceMetric
(
MetricId INTEGER PRIMARY KEY AUTO_INCREMENT,
AmbulanceServiced Integer,
AmbulanceNotServiced Integer,
ICUServiced Integer,
ICUNotServiced Integer,
VentilatorServiced Integer,
VentilatorNotServiced Integer,
IsolationBedServiced Integer,
IsolationBedNotServiced Integer,
OxygenCylinderServiced Integer,
OxygenCylinderNotServiced Integer,
TotalCovidTests Integer,
TotalPositiveTests Integer
)
