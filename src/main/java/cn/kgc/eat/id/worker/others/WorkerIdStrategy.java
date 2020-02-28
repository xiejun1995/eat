package cn.kgc.eat.id.worker.others;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
