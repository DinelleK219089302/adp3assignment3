/*
Dinelle Kotze
219089302
Examination.java
This is the class for the Examination entity.
 */

package za.ac.cput.entity.curriculum;

import java.util.Date;

public class Examination
{
    private int subjectCode;
    private String examDesc, examId;
    private Date examDate;

    private Examination(Builder builder)
    {
        this.examId = builder.examId;
        this.subjectCode = builder.subjectCode;
        this.examDesc = builder.examDesc;
        this.examDate = builder.examDate;
    }

    public String getExamId() {
        return examId;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examID=" + examId + '\'' +
                ", subjectCode=" + subjectCode + '\'' +
                ", examDesc='" + examDesc + '\'' +
                ", examDate=" + examDate + '\'' +
                '}';
    }

    public static class Builder
    {
        private int subjectCode;
        private String examDesc, examId;
        private Date examDate;

        public Builder setExamId(String examId)
        {
            this.examId = examId;
            return this;
        }

        public Builder setSubjectCode(int subjectCode)
        {
            this.subjectCode = subjectCode;
            return this;
        }


        public Builder setExamDesc(String examDesc)
        {
            this.examDesc = examDesc;
            return this;
        }

        public Builder setExamDate(Date examDate)
        {
            this.examDate = examDate;
            return this;
        }

        public Examination build()
        {
            return new Examination(this);
        }

        public Builder copy(Examination examination)
        {
            this.examId = examination.examId;
            this.subjectCode = examination.subjectCode;
            this.examDesc = examination.examDesc;
            this.examDate = examination.examDate;
            return this;
        }

    }
}
