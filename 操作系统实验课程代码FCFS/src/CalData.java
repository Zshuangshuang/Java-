import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-12
 * Time: 17:04
 **/
//数据处理的接口
public interface CalData {
    //得到开始时间
     Integer startTime(Process process);
    //得到结束时间
    Integer endTime(Process process);
    //得到周转时间
    Integer turnAroundTime(Process process);
    //得到带权周转时间
    Double turnAroundWithWeightTime(Process process);
    //得到平均周转时间
    Double avgTurnAroundTime();
    //得到平均带权周转时间
    Double avgTurnAroundWithWeightTime();
}
