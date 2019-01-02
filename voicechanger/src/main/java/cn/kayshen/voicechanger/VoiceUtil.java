package cn.kayshen.voicechanger;

/**
 * @author kayshen
 * @emil kayshen_xu@163.com
 * create on 2019/1/2
 */
public class VoiceUtil {
    public static final int MODE_NORMAL = 0;
    public static final int MODE_LORIE = 1;
    public static final int MODE_UNCLE = 2;
    public static final int MODE_TERROR = 3;
    public static final int MODE_GHOST = 4;
    public static final int MODE_VACANT = 5;

    /**
     * 音效处理传2个值
     *
     * @param path 音频文件路径
     * @param type 音频文件类型
     */
    public native static void fix(String path, int type);

    static {
        System.loadLibrary("fmodL");
        System.loadLibrary("fmod");
        System.loadLibrary("sound");
    }
}