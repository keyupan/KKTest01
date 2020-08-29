package com.KK.dao.daoInterface;

import com.KK.javabean.JobSeeker;

public interface JobSeekerDao {
    public JobSeeker selectAllJobseeker();
    public JobSeeker selectJobseeker_ByNameAndPsw(String username,String password);
    public int isnertJobseeker(JobSeeker j);
    public int deleteJobseeker(JobSeeker j);//有登陆前提才能注销账户
    public int updateJobseeker(JobSeeker j);


}
