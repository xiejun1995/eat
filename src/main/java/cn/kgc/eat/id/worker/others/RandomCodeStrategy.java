package cn.kgc.eat.id.worker.others;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
