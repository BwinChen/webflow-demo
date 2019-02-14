//package com.bwin.webflow;
//
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@AllArgsConstructor
////@EnableWebMvc
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    private final WebFlowConfig webFlowConfig;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//    }
//
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/view/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
//
//    @Bean
//    public FlowHandlerMapping flowHandlerMapping() {
//        FlowHandlerMapping handlerMapping = new FlowHandlerMapping();
//        handlerMapping.setOrder(-1);
//        handlerMapping.setFlowRegistry(this.webFlowConfig.flowRegistry());
//        return handlerMapping;
//    }
//
//    @Bean
//    public FlowHandlerAdapter flowHandlerAdapter() {
//        FlowHandlerAdapter handlerAdapter = new FlowHandlerAdapter();
//        handlerAdapter.setFlowExecutor(this.webFlowConfig.flowExecutor());
//        handlerAdapter.setSaveOutputToFlashScopeOnRedirect(true);
//        return handlerAdapter;
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/activation").setViewName("view/activation");
//        registry.addViewController("/failure").setViewName("view/failure");
//        registry.addViewController("/success").setViewName("view/success");
//        registry.addViewController("/sample").setViewName("view/sample");
//    }
//
//}
