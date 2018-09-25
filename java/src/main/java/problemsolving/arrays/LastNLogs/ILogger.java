package problemsolving.arrays.LastNLogs;

public interface ILogger {

    /**
     * adds the info to the log
     * @param
     */
    void record(String info);

    /**
     *
     * @param i the last i-th element from the log to be returned
     * @return
     */
    String getLast(int i);
}
