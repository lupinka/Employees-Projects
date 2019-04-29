INSERT INTO Employee(ID,EmployeeID,EmployeeName,ProjectID) VALUES
('1','1', 'Jan Kowalski', '1'),
('2','2', 'Tomasz Nowak', '2'),
('3','1','Jan Kowalski','3'),
('4','3','Weronika XXX','1');

delete from Employee where EmployeeID=3

delete from Project where ProjectID=3

INSERT into Project(ProjectID, ProjectName, startDate, endDate) VALUES
('1','Project X','2019-04-27','2019-04-29'),
('2','Project Y','2019-05-01','2020-05-01'),
('3','Project Z','2019-06-01','2019-12-01');