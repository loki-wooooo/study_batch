package io.github.loki.batch.springbatch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JobRunner implements ApplicationRunner {

    //Spring 배치 초기화 시 객체가 생성되어 있음.
    private JobLauncher jobLauncher;
    private Job job;

    public JobRunner(Job job, JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        JobParameters jobParameters = new JobParametersBuilder()
                .addString("name", "user1")
                .toJobParameters();
        jobLauncher.run(job, jobParameters);

    }

}
