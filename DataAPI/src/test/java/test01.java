import com.axatp.api.proxy.AzkabanServiceProxyBuilder;
import com.axatp.api.service.AzkabanService;
import org.junit.Test;

public class test01 {

    @Test
    public void builder() {
        AzkabanService services = AzkabanServiceProxyBuilder.create()
                .setUri("http://localhost:18081")
//                .setUri("http://192.168.8.230:8081")
                .setUsername("admin")
                .setPassword("admin")
                .build();

        services.createProject("wpp0909","test");     //创建project

//        services.deleteProject("wpp0909");            //删除project

        services.uploadProjectZip("C:\\Users\\Administrator\\Desktop\\test.zip","wpp0909");      //向project中上传zip

        //查询某个project中的项目Flows
//        FetchFlowsResponse wpp0908 = services.fetchProjectFlows("wpp0908");
//        System.out.println(wpp0908.getFlows());

        //执行某个project中的Flows
//        ExecuteFlowResponse wpp0908 = services.executeFlow("wpp0908", "test02");
//        System.out.println(wpp0908);
        
        //取消某个flows
//        BaseResponse baseResponse = services.cancelFlow("3");
//        System.out.println(baseResponse);

        //查询某个flow执行信息
//        FetchExecFlowResponse fetchExecFlowResponse = services.fetchExecFlow("3");
//        System.out.println(fetchExecFlowResponse);

        //查询执行Job的日志
//        FetchExecJobLogs test02 = services.fetchExecJobLogs("3", "test", 0, 1000);
//        System.out.println(test02);

        //查询Flow的执行记录
//        FetchFlowExecutionsResponse fetchFlowExecutionsResponse = services.fetchFlowExecutions("wpp0908", "test02", 0, 100);
//        System.out.println(fetchFlowExecutionsResponse);

        //查询整个project
//        FetchAllProjectsResponse fetchAllProjectsResponse = services.fetchAllProjects();
//        System.out.println(fetchAllProjectsResponse);

        //设置定时任务
//        ScheduleCronFlowResponse scheduleCronFlowResponse = services.scheduleCronFlow("wpp0908", "test02", "0%201%20*%20*%20*%20?");
//        System.out.println(scheduleCronFlowResponse);

        //查询定时任务
//        FetchScheduleResponse fetchScheduleResponse = services.fetchSchedule("7", "test02");
//        System.out.println(fetchScheduleResponse);

        //取消定时任务
//        BaseResponse baseResponse = services.removeSchedule("3");
//        System.out.println(baseResponse);

        
        
    }

}
