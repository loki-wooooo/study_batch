package io.github.loki.batch.springbatch;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class HelloJobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;


    @Bean
    public Job helloJob() {

        /**
         * Job 생성
         *  기본적으로 "step"을 필수로 갖고있어야 함
         * */
        return jobBuilderFactory.get("helloJob")
                .start(helloStep1())
                .next(helloStep2())
                .build();
    }

    @Bean
    public Step helloStep1() {

        /**
         * Step 에서는 Tasklet을 무한 반복 함.
         * */
        return stepBuilderFactory.get("helloStep1")
                .tasklet(new Tasklet() {
                    // 익명클래스 생성
                    @Override
                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
                        System.out.println(" =========================");
                        System.out.println(" >> Hello Spring Batch!!");
                        System.out.println(" =========================");
                        return RepeatStatus.FINISHED; // null 과 같은 개념
                    }
                })
                .build();
    }

    @Bean
    public Step helloStep2() {

        return stepBuilderFactory.get("helloStep2")
                .tasklet(new Tasklet() {
                    // 익명클래스 생성
                    @Override
                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
                        System.out.println(" =========================");
                        System.out.println(" >> Step2 was executed!!");
                        System.out.println(" =========================");
                        return RepeatStatus.FINISHED; // null 과 같은 개념
                    }
                })
                .build();
    }


}
