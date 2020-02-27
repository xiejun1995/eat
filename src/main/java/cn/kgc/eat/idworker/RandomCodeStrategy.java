package cn.kgc.eat.idworker;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
