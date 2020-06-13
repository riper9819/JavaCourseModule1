/*
 * Class name: Student
 *
 * Version info 1.0
 *
 * 11-Jun-2020
 *
 * Copyright (c) Mandych Bohdan
 *
 * Description:
    Factory Method.
    Create fabric and abstract fabric for your class.
    Create a class Student - 25 fields.
    Create a builder for the class Student.
 */

package Module2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

//This class contains fields for student data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Main.Gender gender; //male or female
    private LocalDate birthday;
    private boolean maritalStatus; //married (true) or single (false)
    private String nationality;
    //Current address
    private String country;
    private String city;
    private String street;
    private String house;
    private int zipcode;
    private String phone; //student phone number
    private String email; //student email
    private Main.Course course; //master's, bachelor's or postgraduate degrees
    private Main.Institute institute; //institute where study student
    private Main.Chair chair; //chair where study student
    private LocalDate startedStudy; //date when student started his study
    private boolean fullTimeStudy; //full-time (true) or part-time study (false)
    private boolean commercialStudy; //commercial (true) or non commercial study (false)
    private float scholarship; //amount of student financial reward for results of his study
    private float mark; //Student average mark
    private boolean militaryDepartment; //shows whether student attends military department or not
    private boolean dormitory; //dormitory requirement
    private String education; //Previous education

    /**
     * Default constructor without parameters
     */
    public Student() {
    }

    /**
     * Class constructor with all parameters
     * @param id Identification number that will be set to student object
     * @param firstName First Name that will be set to student object
     * @param lastName Last name that will be set to student object
     * @param patronymic Patronymic that will be set to student object
     * @param gender Gender that will be set to student object
     * @param birthday Birth date that will be set to student object
     * @param maritalStatus Marital status that will be set to student object
     * @param nationality Nationality that will be set to student object
     * @param country Country that will be set to student object
     * @param city City that will be set to student object
     * @param street Street date that will be set to student object
     * @param house House that will be set to student object
     * @param zipcode Zip code that will be set to student object
     * @param phone Phone that will be set to student object
     * @param email Email that will be set to student object
     * @param course Course that will be set to student object
     * @param institute Institute that will be set to student object
     * @param chair Chair that will be set to student object
     * @param startedStudy Beginning of study date that will be set to student object
     * @param fullTimeStudy Time form of study that will be set to student object
     * @param commercialStudy Commercial form of study that will be set to student object
     * @param scholarship Scholarship that will be set to student object
     * @param mark Average mark that will be set to student object
     * @param militaryDepartment Military department attendance status that will be set to student object
     * @param dormitory Dormitory requirement status that will be set to student object
     * @param education Previous eductaion that will be set to student object
     */
    public Student(int id,
                   String firstName,
                   String lastName,
                   String patronymic,
                   Main.Gender gender,
                   LocalDate birthday,
                   boolean maritalStatus,
                   String nationality,
                   String country,
                   String city,
                   String street,
                   String house,
                   int zipcode,
                   String phone,
                   String email,
                   Main.Course course,
                   Main.Institute institute,
                   Main.Chair chair,
                   LocalDate startedStudy,
                   boolean fullTimeStudy,
                   boolean commercialStudy,
                   int scholarship,
                   float mark,
                   boolean militaryDepartment,
                   boolean dormitory,
                   String education) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
        this.course = course;
        this.institute = institute;
        this.chair = chair;
        this.startedStudy = startedStudy;
        this.fullTimeStudy = fullTimeStudy;
        this.commercialStudy = commercialStudy;
        this.scholarship = scholarship;
        this.mark = mark;
        this.militaryDepartment = militaryDepartment;
        this.dormitory = dormitory;
        this.education = education;
    }

    /**
     * Getter for student id field
     * @return Returns id of Student object
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for student id field
     * @param id Sets identification number of student object
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for student firstName field
     * @return Returns first name of Student object
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for student firstName field
     * @param firstName Sets first name of student object
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for student lastName field
     * @return Returns last name of Student object
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for student lastName field
     * @param lastName Sets last name of student object
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for student patronymic field
     * @return Returns patronymic of Student object
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Setter for student patronymic field
     * @param patronymic Sets patronymic of student object
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /**
     * Getter for student gender field
     * @return Returns gender of Student object
     */
    public Main.Gender getGender() {
        return gender;
    }

    /**
     * Setter for student gender field
     * @param gender Sets gender of student object
     */
    public void setGender(Main.Gender gender) {
        this.gender = gender;
    }

    /**
     * Getter for student birthday field
     * @return Returns birthday of Student object
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Setter for student birthday field
     * @param birthday Sets birthday of student object
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Getter for student maritalStatus field
     * @return Returns boolean of marital status of Student object
     */
    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Setter for student maritalStatus field
     * @param maritalStatus Sets marital status of student object
     */
    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Getter for student nationality field
     * @return Returns nationality of Student object
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter for student nationality field
     * @param nationality Sets nationality of student object
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Getter for student country field
     * @return Returns country of Student object
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for student country field
     * @param country Sets country of student object
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for student city field
     * @return Returns city of Student object
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter for student city field
     * @param city Sets city of student object
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for student street field
     * @return Returns street of Student object
     */
    public String getStreet() {
        return street;
    }

    /**
     * Setter for student street field
     * @param street Sets street of student object
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for student house field
     * @return Returns house of Student object
     */
    public String getHouse() {
        return house;
    }

    /**
     * Setter for student house field
     * @param house Sets house of student object
     */
    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * Getter for student zipcode field
     * @return Returns zip code of Student object
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Setter for student zipcode field
     * @param zipcode Sets zip house of student object
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * Getter for student phone field
     * @return Returns phone of Student object
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for student phone field
     * @param phone Sets phone of student object
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for student email field
     * @return Returns email of Student object
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for student email field
     * @param email Sets email of student object
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for student course field
     * @return Returns course of Student object
     */
    public Main.Course getCourse() {
        return course;
    }

    /**
     * Setter for student course field
     * @param course Sets course of student object
     */
    public void setCourse(Main.Course course) {
        this.course = course;
    }

    /**
     * Getter for student institute field
     * @return Returns institute of Student object
     */
    public Main.Institute getInstitute() {
        return institute;
    }

    /**
     * Setter for student institute field
     * @param institute Sets institute of student object
     */
    public void setInstitute(Main.Institute institute) {
        this.institute = institute;
    }

    /**
     * Getter for student chair field
     * @return Returns chair of Student object
     */
    public Main.Chair getChair() {
        return chair;
    }

    /**
     * Setter for student chair field
     * @param chair Sets chair of student object
     */
    public void setChair(Main.Chair chair) {
        this.chair = chair;
    }

    /**
     * Getter for student startedStudy field
     * @return Returns date of study beginning of Student object
     */
    public LocalDate getStartedStudy() {
        return startedStudy;
    }

    /**
     * Setter for student startedStudy field
     * @param startedStudy Sets date of study beginning of student object
     */
    public void setStartedStudy(LocalDate startedStudy) {
        this.startedStudy = startedStudy;
    }

    /**
     * Getter for student fullTimeStudy field
     * @return Returns boolean of time form of study of Student object
     */
    public boolean isFullTimeStudy() {
        return fullTimeStudy;
    }

    /**
     * Setter for student fullTimeStudy field
     * @param fullTimeStudy Sets boolean of time form of study of student object
     */
    public void setFullTimeStudy(boolean fullTimeStudy) {
        this.fullTimeStudy = fullTimeStudy;
    }

    /**
     * Getter for student commercialStudy field
     * @return Returns boolean of commercial form of study of Student object
     */
    public boolean isCommercialStudy() {
        return commercialStudy;
    }

    /**
     * Setter for student commercialStudy field
     * @param commercialStudy Sets boolean of commercial form of study of student object
     */
    public void setCommercialStudy(boolean commercialStudy) {
        this.commercialStudy = commercialStudy;
    }

    /**
     * Getter for student scholarship field
     * @return Returns scholarship of Student object
     */
    public float getScholarship() {
        return scholarship;
    }

    /**
     * Setter for student scholarship field
     * @param scholarship Sets scholarship of student object
     */
    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }

    /**
     * Getter for student mark field
     * @return Returns average mark of Student object
     */
    public float getMark() {
        return mark;
    }

    /**
     * Setter for student scholarship field
     * @param mark Sets scholarship of student object
     */
    public void setMark(float mark) {
        this.mark = mark;
    }

    /**
     * Getter for student militaryDepartment field
     * @return Returns boolean of military department attendance status of Student object
     */
    public boolean isMilitaryDepartment() {
        return militaryDepartment;
    }

    /**
     * Setter for student setMilitaryDepartment field
     * @param militaryDepartment Sets military department attendance of student object
     */
    public void setMilitaryDepartment(boolean militaryDepartment) {
        this.militaryDepartment = militaryDepartment;
    }

    /**
     * Getter for student dormitory field
     * @return Returns boolean of dormitory requirement of Student object
     */
    public boolean isDormitory() {
        return dormitory;
    }

    /**
     * Setter for student dormitory field
     * @param dormitory Sets dormitory of student object
     */
    public void setDormitory(boolean dormitory) {
        this.dormitory = dormitory;
    }

    /**
     * Getter for student education field
     * @return Returns previous education of Student object
     */
    public String getEducation() {
        return education;
    }

    /**
     * Setter for student education field
     * @param education Sets previous education of student object
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * Method to check whether object equals by value
     * @param o Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isMaritalStatus() == student.isMaritalStatus() &&
                getId() == student.getId() &&
                getZipcode() == student.getZipcode() &&
                isFullTimeStudy() == student.isFullTimeStudy() &&
                isCommercialStudy() == student.isCommercialStudy() &&
                getScholarship() == student.getScholarship() &&
                getMark() == student.getMark() &&
                isMilitaryDepartment() == student.isMilitaryDepartment() &&
                isDormitory() == student.isDormitory() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                getGender() == student.getGender() &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getNationality(), student.getNationality()) &&
                Objects.equals(getCountry(), student.getCountry()) &&
                Objects.equals(getCity(), student.getCity()) &&
                Objects.equals(getStreet(), student.getStreet()) &&
                Objects.equals(getHouse(), student.getHouse()) &&
                Objects.equals(getPhone(), student.getPhone()) &&
                Objects.equals(getEmail(), student.getEmail()) &&
                getCourse() == student.getCourse() &&
                getInstitute() == student.getInstitute() &&
                getChair() == student.getChair() &&
                Objects.equals(getStartedStudy(), student.getStartedStudy()) &&
                Objects.equals(getEducation(), student.getEducation());
    }

    /**
     * Method to get object hash
     * @return Returns sign object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPatronymic(), getGender(), getBirthday(), isMaritalStatus(), getNationality(), getCountry(), getCity(), getStreet(), getHouse(), getZipcode(), getPhone(), getEmail(), getCourse(), getInstitute(), getChair(), getStartedStudy(), isFullTimeStudy(), isCommercialStudy(), getScholarship(), getMark(), isMilitaryDepartment(), isDormitory(), getEducation());
    }

    /**
     * Method to get formatted sign object
     * @return Returns info about sign object
     */
    @Override
    public String toString() {
        return "\n----------------Student survey " + this.id + "----------------" +
                "\nFirst name: " + this.firstName +
                "\nLast name: " + this.lastName +
                "\nPatronymic: " + this.patronymic +
                "\nGender: " + this.gender +
                "\nBirthday: " + this.birthday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                "\nMarital status: " + (this.maritalStatus ? "Married" : "Single") +
                "\nNationality: " + this.nationality +
                "\nResidence address: " + this.country + " " + this.city + " " + this.street + " " + this. house +
                "\nZipcode: " + this.zipcode +
                "\nPhone number: " + this.phone +
                "\nEmail address: " + this.email +
                "\nCourse of study: " + this.course +
                "\nInstitute: " + this.institute +
                "\nChair: " + this.chair +
                "\nBeginning of study: " + this.startedStudy.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                "\nTime form of study: " + (this.fullTimeStudy ? "Full-time" : "Part-time") +
                "\nCommercial form of study: " + (this.commercialStudy ? "Government budget" : "Own budget") +
                "\nScholarship: " + this.scholarship + " grn" +
                "\nAverage mark: " + this.mark +
                "\nMilitary department attendance: " + (this.militaryDepartment ? "Attended" : "Not attended") +
                "\nDormitory requirement: " + (this.dormitory ? "Required" : "Not required") +
                "\nPrevious education: " + this.education;
    }

    //This class have methods for Student object creation
    public static class Builder{
        private Student studentToBuild;

        //Builder method for Student objects creation
        public Builder() {
            this.studentToBuild = new Student();
        }

        /**
         * Builder similarity setter for Student object
         * @param student object of Student class that will be used as a base for new student object
         */
        public Builder setSimilarTo(Student student) {
            this.studentToBuild.id = student.id;
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.maritalStatus = student.maritalStatus;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.country = student.country;
            this.studentToBuild.city = student.city;
            this.studentToBuild.street = student.street;
            this.studentToBuild.house = student.house;
            this.studentToBuild.zipcode = student.zipcode;
            this.studentToBuild.phone = student.phone;
            this.studentToBuild.email = student.email;
            this.studentToBuild.course = student.course;
            this.studentToBuild.institute = student.institute;
            this.studentToBuild.chair = student.chair;
            this.studentToBuild.startedStudy = student.startedStudy;
            this.studentToBuild.fullTimeStudy = student.fullTimeStudy;
            this.studentToBuild.commercialStudy = student.commercialStudy;
            this.studentToBuild.scholarship = student.scholarship;
            this.studentToBuild.mark = student.mark;
            this.studentToBuild.militaryDepartment = student.militaryDepartment;
            this.studentToBuild.dormitory = student.dormitory;
            this.studentToBuild.education = student.education;
            return this;
        }

        //Creating setters for Student object in Build class
        /**
         * Setter for student id field
         * @param id Sets identification number of student object
         */
        public Builder setId(int id){
            studentToBuild.setId(id);
            return this;
        }

        /**
         * Setter for student firstName field
         * @param firstName Sets first name of student object
         */
        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        /**
         * Setter for student lastName field
         * @param lastName Sets last name of student object
         */
        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        /**
         * Setter for student patronymic field
         * @param patronymic Sets patronymic of student object
         */
        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        /**
         * Setter for student gender field
         * @param gender Sets gender of student object
         */
        public Builder setGender(Main.Gender gender){
            studentToBuild.setGender(gender);
            return this;
        }

        /**
         * Setter for student birthday field
         * @param birthday Sets birthday of student object
         */
        public Builder setBirthday(LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }

        /**
         * Setter for student maritalStatus field
         * @param maritalStatus Sets marital status of student object
         */
        public Builder setMaritalStatus(boolean maritalStatus){
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }

        /**
         * Setter for student nationality field
         * @param nationality Sets nationality of student object
         */
        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        /**
         * Setter for student country field
         * @param country Sets country of student object
         */
        public Builder setCountry(String country){
            studentToBuild.setCountry(country);
            return this;
        }

        /**
         * Setter for student city field
         * @param city Sets city of student object
         */
        public Builder setCity(String city){
            studentToBuild.setCity(city);
            return this;
        }

        /**
         * Setter for student street field
         * @param street Sets street of student object
         */
        public Builder setStreet(String street){
            studentToBuild.setStreet(street);
            return this;
        }

        /**
         * Setter for student house field
         * @param house Sets house of student object
         */
        public Builder setHouse(String house){
            studentToBuild.setHouse(house);
            return this;
        }

        /**
         * Setter for student zipcode field
         * @param zipcode Sets zip house of student object
         */
        public Builder setZipcode(int zipcode){
            studentToBuild.setZipcode(zipcode);
            return this;
        }

        /**
         * Setter for student phone field
         * @param phone Sets phone of student object
         */
        public Builder setPhone(String phone){
            studentToBuild.setPhone(phone);
            return this;
        }

        /**
         * Setter for student email field
         * @param email Sets email of student object
         */
        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }

        /**
         * Setter for student course field
         * @param course Sets course of student object
         */
        public Builder setCourse(Main.Course course){
            studentToBuild.setCourse(course);
            return this;
        }

        /**
         * Setter for student institute field
         * @param institute Sets institute of student object
         */
        public Builder setInstitute(Main.Institute institute){
            studentToBuild.setInstitute(institute);
            return this;
        }

        /**
         * Setter for student chair field
         * @param chair Sets chair of student object
         */
        public Builder setChair(Main.Chair chair){
            studentToBuild.setChair(chair);
            return this;
        }

        /**
         * Setter for student startedStudy field
         * @param startedStudy Sets date of study beginning of student object
         */
        public Builder setStartedStudy(LocalDate startedStudy){
            studentToBuild.setStartedStudy(startedStudy);
            return this;
        }

        /**
         * Setter for student fullTimeStudy field
         * @param fullTimeStudy Sets boolean of time form of study of student object
         */
        public Builder setFullTimeStudy(boolean fullTimeStudy){
            studentToBuild.setFullTimeStudy(fullTimeStudy);
            return this;
        }

        /**
         * Setter for student commercialStudy field
         * @param commercialStudy Sets boolean of commercial form of study of student object
         */
        public Builder setCommercialStudy(boolean commercialStudy){
            studentToBuild.setCommercialStudy(commercialStudy);
            return this;
        }

        /**
         * Setter for student scholarship field
         * @param scholarship Sets scholarship of student object
         */
        public Builder setScholarship(float scholarship){
            studentToBuild.setScholarship(scholarship);
            return this;
        }

        /**
         * Setter for student scholarship field
         * @param mark Sets scholarship of student object
         */
        public Builder setMark(float mark){
            studentToBuild.setMark(mark);
            return this;
        }

        /**
         * Setter for student setMilitaryDepartment field
         * @param militaryDepartment Sets military department attendance of student object
         */
        public Builder setMilitaryDepartment(boolean militaryDepartment){
            studentToBuild.setMilitaryDepartment(militaryDepartment);
            return this;
        }

        /**
         * Setter for student dormitory field
         * @param dormitory Sets dormitory of student object
         */
        public Builder setDormitory(boolean dormitory){
            studentToBuild.setDormitory(dormitory);
            return this;
        }

        /**
         * Setter for student education field
         * @param education Sets previous education of student object
         */
        public Builder setEducation(String education){
            studentToBuild.setEducation(education);
            return this;
        }

        //Builder method that returns a new student object
        public Student build(){
            return studentToBuild;
        }
    }
}
