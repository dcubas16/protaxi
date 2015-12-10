/*Image*/
insert into image (id,is_main,path)values(1,false,'/image1');
insert into image (id,is_main,path)values(2,false,'/image2');

/*Size*/
insert into size (id,name) values (1, 'size1');
insert into size (id,name) values (2, 'size2');
insert into size (id,name) values (3, 'size3');

/*Material*/
insert into material (id,name) values(1,'material1');
insert into material (id,name) values(2,'material2');
insert into material (id,name) values(3,'material3');

/*Products*/
insert into product (id, name, description) values (1,'P1', 'P1 Description');
insert into product (id, name, description) values (2,'P100', 'P100 Description');

/*Chemical Products*/
insert into chemical_product (id, chemical_formula) values (1,'/root/images1');
insert into chemical_product (id, chemical_formula) values (2,'/root/images1');

