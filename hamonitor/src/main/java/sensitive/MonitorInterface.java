package sensitive;

import java.util.List;

interface MonitorInterface {

    List<MonitorStatu> getClusterStatus();

    void openJob();
}
