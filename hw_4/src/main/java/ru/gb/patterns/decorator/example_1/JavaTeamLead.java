package ru.gb.patterns.decorator.example_1;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeReport(){
        return "Send report.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
