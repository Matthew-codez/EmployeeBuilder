package org.example;

public class Job {
    private String jobTitle;
    private String jobNumber;
    private String jobDescription;

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    private Job (Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.jobNumber = builder.jobNumber;
        this.jobDescription = builder.jobDescription;
    }

    public static class Builder{
        private String jobTitle;
        private String jobNumber;
        private String jobDescription;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }
        public Builder setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public Builder setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public Builder copy(Job job) {
            this.jobTitle = job.getJobTitle();
            this.jobNumber = job.getJobNumber();
            this.jobDescription = job.getJobDescription();
            return this;
        }
        public Job build(){
            return new Job(this);
        }
    }
}
