package com.company;

import Write_Files.Write_Audit;

public class Client {
    private final String first_name;
    private final String last_name;
    private final int age;

    public Client(String first_name, String last_name, int age ) {
        Write_Audit.writeAudit("New Client");
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getFullName(){
        return first_name+" "+last_name;
    }
    public int getAge() {
        return age;
    }
}
