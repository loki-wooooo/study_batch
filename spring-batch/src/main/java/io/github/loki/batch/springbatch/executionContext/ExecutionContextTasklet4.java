package io.github.loki.batch.springbatch.executionContext;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class ExecutionContextTasklet4 implements Tasklet {

    @Override
    public RepeatStatus execute(
            StepContribution stepContribution
            , ChunkContext chunkContext
    ) throws Exception {
        System.out.println("step4 was executed");

        /**
         * step3에서 저장한 name의 key 값을 출력
         * */
        Object name = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("name");
        System.out.println("name: " + name.toString());

        return RepeatStatus.FINISHED;
    }
}
