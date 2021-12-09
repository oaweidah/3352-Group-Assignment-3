package models;

public class Section {
    private int sectionNumber;
    private String SectionTAName;
    public int getSectionNumber() {
        return sectionNumber;
    }
    
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getSectionTAName() {
        return SectionTAName;
    }
    
    public void setSectionTAName(String sectionTAName) {
        this.SectionTAName = sectionTAName;
    }
}
