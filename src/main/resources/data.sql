INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator,Url)

values
('Sakra Hospital', 'SY NO 52/2 & 52/3, Devarabeesanahalli, Varthur Hobli Opp Intel, Outer Ring Rd, Marathahalli, Bengaluru, Karnataka 560103', 13.1908548,77.527357,
'9964811222',
'abc@gmail.com',
'yes',
20,
10,
100,
100,
50,
50,
200,
200,
150,
134,'https://g.page/SakraWorldHospital');

INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator,Url)

values
('Manipal hospital', 'Manipal hospital, HAL Old Airport Rd, Kodihalli, Bengaluru, Karnataka 560017', 12.9597192,77.6484053,
'9964811222',
'abc@gmail.com',
'yes',
20,
20,
100,
100,
50,
50,
200,
200,
150,
134,'https://goo.gl/maps/ieRwrcnaEPN2uKt18');

INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator,Url)

values
('Jeevika Hospital', '95/3, Marathahalli Outer Ring Rd, Karthik Nagar, Anand Nagar, Aswath Nagar, Marathahalli, Bengaluru, Karnataka 560037', 12.9659818,77.6850668,
 '9964811222',
 'abc@gmail.com',
 'yes',
 20,
 20,
 100,
 100,
 50,
 50,
 200,
 200,
 150,
 134,'https://goo.gl/maps/QjUwwGYJXEQijc2L6');

INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator,Url)

values
('Rainbow Children’s Hospital', 'Survey No. 8/5, Marathahalli-KR Puram, Outer Ring Rd, Doddanekundi, Marathahalli, Bengaluru, Karnataka 560037', 12.9753439,77.6802193,
 '9964811222',
 'abc@gmail.com',
 'yes',
 20,
 20,
 100,
 100,
 50,
 50,
 200,
 200,
 150,
 134,'https://goo.gl/maps/QucGDNDX4qoVwDyo8');
 
 insert into CovidSymptons (Symptons,severity) values ('Runny nose','Low');
 insert into CovidSymptons (Symptons,severity) values ('High Fever','Low');
 insert into CovidSymptons (Symptons,severity) values ('Throat Infection','Low');
 insert into CovidSymptons (Symptons,severity) values ('Breathing Problem','High');
 insert into CovidSymptons (Symptons,severity) values ('Loosing Taste','High');
 
 
 insert into PastMedicalCondition (MedCon,Severity,ICURequired,VentilationRequired)
 values ('Diabetes','High','Yes','No'),
        ('Cancer','High','Yes','Yes'),
        ('Tuberclosis','Medium','Yes','No'),
        ('LungDiseases','High','Yes','Yes');
        
 
insert into CAServiceMetric (AmbulanceServiced,AmbulanceNotServiced ,ICUServiced ,ICUNotServiced ,VentilatorServiced ,VentilatorNotServiced,IsolationBedServiced,IsolationBedNotServiced,OxygenCylinderServiced,OxygenCylinderNotServiced )
values(0,0,0,0,0,0,0,0,0,0);       

