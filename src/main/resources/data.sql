INSERT INTO Hospitals 
(HospitalName,HospitalAddress,Lattitude,Longitude,Locality,
TotalICU,TotalVentilator,TotalAmbulance,
AvailableICU,AvailableVentilator,AvailableAmbulance)
 VALUES ('ManipalHospital', 'BTM Layout', 123.5678,123.5678,'BTM Layout',100,100,100,20,20,20); 
 
 INSERT INTO Hospitals 
(HospitalName,HospitalAddress,Lattitude,Longitude,Locality,
TotalICU,TotalVentilator,TotalAmbulance,
AvailableICU,AvailableVentilator,AvailableAmbulance)
 VALUES ('SathyaSaiHospital', 'BTM Layout', 123.5678,123.5678,'BTM Layout',100,100,100,20,20,20);
 
 INSERT INTO Hospitals 
(HospitalName,HospitalAddress,Lattitude,Longitude,Locality,
TotalICU,TotalVentilator,TotalAmbulance,
AvailableICU,AvailableVentilator,AvailableAmbulance)
 VALUES ('BrookfieldHospital', 'BTM Layout', 123.5678,123.5678,'BTM Layout',100,100,100,20,20,20);
 
 INSERT INTO Hospitals 
(HospitalName,HospitalAddress,Lattitude,Longitude,Locality,
TotalICU,TotalVentilator,TotalAmbulance,
AvailableICU,AvailableVentilator,AvailableAmbulance)
 VALUES ('AmitHospital', 'BTM Layout', 123.5678,123.5678,'BTM Layout',100,100,100,20,20,20);
 
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
        
  insert into PatientInfo (FirstName,LastName,Age,Sex,AddressLine1,AddressLine2,Lattitude,Longitude,pastmedconid)
  values 
  ('Test1','Test1','23','M','test','test','123.23','14.5236',1),
   ('Test1','Test1','23','M','test','test','123.23','14.5236',2),
    ('Test1','Test1','23','M','test','test','123.23','14.5236',2),
     ('Test1','Test1','23','M','test','test','123.23','14.5236',3),
      ('Test1','Test1','23','M','test','test','123.23','14.5236',4),
       ('Test1','Test1','23','M','test','test','123.23','14.5236',2),
        ('Test1','Test1','23','M','test','test','123.23','14.5236',3);
          
