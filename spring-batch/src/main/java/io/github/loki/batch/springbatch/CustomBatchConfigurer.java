package io.github.loki.batch.springbatch;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.boot.autoconfigure.batch.BasicBatchConfigurer;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;

import javax.sql.DataSource;


public class CustomBatchConfigurer extends BasicBatchConfigurer {

    private final DataSource dataSource;

    protected CustomBatchConfigurer(BatchProperties properties, DataSource dataSource, TransactionManagerCustomizers transactionManagerCustomizers) {
        super(properties, dataSource, transactionManagerCustomizers);
        this.dataSource = dataSource;
    }


    @Override
    public JobRepository createJobRepository() {
        JobRepositoryFactoryBean jobRepositoryFactoryBean;
        jobRepositoryFactoryBean = new JobRepositoryFactoryBean();
        return super.createJobRepository();
    }

}
