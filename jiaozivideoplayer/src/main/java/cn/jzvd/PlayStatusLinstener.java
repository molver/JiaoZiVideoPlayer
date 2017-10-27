package cn.jzvd;

/**
 * 播放状态监听
 * Created by harvie on 2017/10/27 0027.
 */

public interface PlayStatusLinstener {

    //播放中
    void onPlaying();

    //暂停状态
    void onPause();

    //播放错误
    void onError();

    //播放完成
    void onComplete();
}
