//package io.github.loki.batch.springbatch;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobExecutionListener;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//public class JobRepositoryConfiguration {
//
//    /**
//     * JobBuilderFactory	Job 생성용 빌더 객체 생성	Job 정의 시
//     * StepBuilderFactory	Step 생성용 빌더 객체 생성	Step 정의 시
//     * JobExecutionListener	Job 실행 전후 이벤트 처리(로직 추가 가능)	Job 실행 시
//     */
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//    private final JobExecutionListener jobExecutionListener;
//
//    @Bean
//    public Job batchJob() {
//        return jobBuilderFactory.get("batchJob")
//                .start(step1())
//                .next(step2())
//                .listener(jobExecutionListener)
//                .build();
//    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .tasklet(new Tasklet() {
//                    @Override
//                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//                        return RepeatStatus.FINISHED;
//                    }
//                })
//                .build();
//    }
//
//    @Bean
//    public Step step2() {
//        return stepBuilderFactory.get("step2")
//                .tasklet(new Tasklet() {
//                    @Override
//                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//                        return RepeatStatus.FINISHED;
//                    }
//                })
//                .build();
//    }
//
//}
