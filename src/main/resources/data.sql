INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator)

values
('ManipalHospital',
'BTM Layout',
'123.5678',
'123.5678',
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
134); 

INSERT INTO Hospitals (HospitalName,HospitalAddress,Lattitude,Longitude,ContactNo,EmailId,AmbulanceServiceAvailable,TotalAmbulance,AvailableAmbulance,TotalIsolationBed,AvailableIsolationBed,TotalICU,AvailableICU,TotalOxygenUnit,AvailableOxygenUnit,TotalVentilator,AvailableVentilator)

values
('ManipalHospital1',
'BTM Layout',
'326.5678',
'456.5678',
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
134); 
 
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

