package hrms.dao;

import hrms.entity.JobApplicant;

public interface IJobDataAccess {
    void save(JobApplicant applicant);
    JobApplicant findById(long id);
}
