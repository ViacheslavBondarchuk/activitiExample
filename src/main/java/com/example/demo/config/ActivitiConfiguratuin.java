package com.example.demo.config;

import org.activiti.engine.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Configuration
public class ActivitiConfiguratuin implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        configProcessEngine();
        processEngine();
        runtimeService();
        repositoryService();
        historyService();
        managementService();
        taskService();
    }

    @Bean
    public ProcessEngineConfiguration configProcessEngine(){
        return ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
    }

    @Bean
    public ProcessEngine processEngine() {
        return ProcessEngines.getDefaultProcessEngine();
    }

    @Bean
    public RuntimeService runtimeService() {
        return processEngine().getRuntimeService();
    }

    @Bean
    public RepositoryService repositoryService() {
        return processEngine().getRepositoryService();
    }

    @Bean
    public HistoryService historyService() {
        return processEngine().getHistoryService();
    }

    @Bean
    public ManagementService managementService() {
        return processEngine().getManagementService();
    }

    @Bean
    public TaskService taskService() {
        return processEngine().getTaskService();
    }

}
