//package io.github.loki.batch.springbatch;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobParameters;
//import org.springframework.batch.core.JobParametersBuilder;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JobParameterTest implements ApplicationRunner {
//
//    @Autowired
//    private JobLauncher jobLauncher;
//
//    @Autowired
//    private Job job;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        /**
//         * Job Parameter 방식 3가지
//         *
//         * 1. code
//         * 2. jar java -jar xxx.jar name=user1  seq(long)=1 date(date)=2025/02/12 age(double)=16.5
//         * 3. SpEL -> 이후 다시 설명
//         * */
//
//        JobParameters jobParameters = new JobParametersBuilder()
//                .addString("name", "user1")
//                .addLong("seq", 1L) // default -> 0L
//                .addDate("date", new Date()) // default -> 1970-01-01
//                .addDouble("age", 16.5)
//                .toJobParameters();
//        jobLauncher.run(job, jobParameters);
//
//
//
//    }
//
//}
