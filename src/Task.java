public class Task {
    private String name;
    private String description;
    
public Task(String n, String d){
    name = n;
    description = d;
}

public String getDescription(){
    return description;
}

public String getName(){
    return name;
}

public void setDescription(String d){
    description=d;
}

public void setName(String n){
    name=n;
}

public boolean validate(){
    if(name == null || description == null || name.equals("") || description.equals(""))return false;
    else return true;
}

public String toString(){
    return "Name: "+name+"\nDescription: "+description+"\n===========\n";
}
//Random note
}
