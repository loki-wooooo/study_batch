//package io.github.loki.batch.springbatch;
//
//import org.springframework.batch.core.*;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JobRepositoryListener implements JobExecutionListener {
//
//    @Autowired
//    JobRepository jobRepository;
//
//    @Override
//    public void beforeJob(JobExecution jobExecution) {
//
//    }
//
//    @Override
//    public void afterJob(JobExecution jobExecution) {
//        String jobName = jobExecution.getJobInstance().getJobName();//job의 정보를 갖고있는 객체
////        JobParameters jobParameters = jobExecution.getJobParameters();
//
//        //DB에 있는 값
//        JobParameters jobParameters = new JobParametersBuilder()
//                .addString("requestData", "20210102")
//                .toJobParameters();
//
//        JobExecution lastJobExecution = jobRepository.getLastJobExecution(jobName, jobParameters);
//        if (lastJobExecution != null) {
//            for (StepExecution stepExcetion : lastJobExecution.getStepExecutions()) {
//                BatchStatus status = stepExcetion.getStatus();
//                ExitStatus exitStatus = stepExcetion.getExitStatus();
//                System.out.println("status: " + status);
//                System.out.println("exitStatus: " + exitStatus);
//
//                String stepName = stepExcetion.getStepName();
//                System.out.println("stepName: " + stepName);
//            }
//        }
//
//
//    }
//}
