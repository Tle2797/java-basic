import com.sun.management.OperatingSystemMXBean;
import java.io.File;
import java.lang.management.ManagementFactory;

public class MemoryCpuDiskSpace {
    public static void main(String[] args) {

        // memory
        OperatingSystemMXBean osBean =
                ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        long totalPhysicalMemory = osBean.getTotalMemorySize();
        long freePhysicalMemory = osBean.getFreeMemorySize();
        long usedPhysicalMemory = totalPhysicalMemory - freePhysicalMemory;

        // cpu
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        double cpuUsage = osBean.getProcessCpuLoad() * 100;

        // disk space
        File disk = new File("/");
        long totalDiskSpace = disk.getTotalSpace();
        long usableDiskSpace = disk.getUsableSpace();
        long usedDiskSpace = totalDiskSpace - usableDiskSpace;

        System.out.println("Memory Information");
        System.out.println("Total Memory: " + formatSize(totalPhysicalMemory));
        System.out.println("Free Memory: " + formatSize(freePhysicalMemory));
        System.out.println("Used Memory: " + formatSize(usedPhysicalMemory));

        System.out.println();

        System.out.println("CPU Information");
        if (cpuUsage >= 0) {
            System.out.printf("CPU Usage: %.2f%%\n", cpuUsage);
        } else {
            System.out.println("CPU Usage: Not available");
        }

        System.out.println();

        System.out.println("Disk Space Information");
        System.out.println("Total Disk Space: " + formatSize(totalDiskSpace));
        System.out.println("Usable Disk Space: " + formatSize(usableDiskSpace));
        System.out.println("Used Disk Space: " + formatSize(usedDiskSpace));
    }

    private static String formatSize(long bytes) {
        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;

        if (gb >= 1) {
            return String.format("%.2f GB", gb);
        } else if (mb >= 1) {
            return String.format("%.2f MB", mb);
        } else if (kb >= 1) {
            return String.format("%.2f KB", kb);
        } else {
            return bytes + " bytes";
        }
    }
}