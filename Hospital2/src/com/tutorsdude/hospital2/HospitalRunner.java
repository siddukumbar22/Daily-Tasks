package com.tutorsdude.hospital2;

import com.tutorsdude.hospital2.Hospital.*;

public class HospitalRunner {
}

public static void main(String[] args) {


    hospital hos1 = new hospital();
    hos1.Name = "government hospital raichur";
    System.out.println(hos1.Name);

    hos1.ceoName = "dr.ankitha";
    System.out.println(hos1.ceoName);

    Department d1 = new Department();
    hos1.Dept = d1;


     d1.deptName = "surgery";
    System.out.println(d1.deptName);
    d1.chiefDoctor = "dr.abhijeet";
    System.out.println(d1.chiefDoctor);
    d1.deptId = 203;
    System.out.println(d1.deptId);

    Doctor Doc1 = new Doctor();
    hos1.Doc = Doc1;

    Doc1.doctorName = "altaf";
    System.out.println(Doc1.doctorName);

    Doc1.specilizedIn = "operations";
    System.out.println(Doc1.specilizedIn);

    Doc1.noOfOperations = "operations";
    System.out.println(Doc1.noOfOperations);

    Patient Pat = new Patient();
    hos1.Pat = Pat;

    Pat.name="eshwar";
    System.out.println(Pat.name);

    Pat.age=18;
    System.out.println(Pat.age);

    Disease Disease = new Disease();
    hos1.disease = Disease;

    Disease.name = "corona";
    System.out.println(Disease.name);
    Disease.seviority = "corona";
    System.out.println(Disease.seviority);
    Disease.cause = "death";
    System.out.println(Disease.cause);

    PatAddress Add = new PatAddress();
    hos1.Add=Address;

    Add.number = 656587098;
    System.out.println(Add.number);
    Add.area = "lbs nagar";
    System.out.println(Add.area);
    Add.city = "raichur";
    System.out.println(Add.city);
    Add.pincode = 584101;
    System.out.println(Add.pincode);




}




}