//package com.ttechlab.services.config.resolver;
//
//import com.netflix.discovery.converters.Auto;
//import org.eclipse.jgit.lib.IndexDiff;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.cloud.config.environment.PropertySource;
//import org.springframework.cloud.config.server.environment.EnvironmentRepository;
//import org.springframework.cloud.config.server.environment.NativeEnvironmentRepository;
//
//import java.util.Map;
//
//public class ProfileBasedApplicationEnvironmentResolver implements EnvironmentRepository {
//
//    @Autowired
//    private NativeEnvironmentRepository nativeEnvironmentRepository;
//
//    @Override
//    public Environment findOne(String application, String profile, String label)
//    {
//        System.out.println("### resolving env for : "+application+", "+profile+", "+label);
//
//        String deploymentType = System.getProperty("app.deployment.type");
//        if (deploymentType == null || deploymentType.length()==0){
//            System.out.println("Deployment type is not defined properly, current value is : "+deploymentType+".\n Resolving from spring.profiles.active value...");
//            System.out.println("Using deployment type : "+profile);
//        }
//
//        else if(!deploymentType.contains(profile)){
//            System.out.println("!!! Requesting config for undeployed profile : "+profile);
//        }
//        Environment environment = nativeEnvironmentRepository.findOne(application, profile, label);
//        return environment;
////        Environment environment = new Environment(application, profile);
////        throw new RuntimeException("interrupter");
//
////        Map<String, String> properties = null;
////        environment.add(new PropertySource("mapPropertySource", properties));
////        return environment;
//    }
//}
