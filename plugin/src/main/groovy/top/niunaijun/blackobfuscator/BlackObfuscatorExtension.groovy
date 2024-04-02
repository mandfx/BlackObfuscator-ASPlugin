package top.niunaijun.blackobfuscator
import org.gradle.api.Project

class BlackObfuscatorExtension {
    boolean enabled = false
    int depth = 1
    String pkgName
    String loadcpp
    String[] obfClass = []
    String[] blackClass = []
    String[] entryClass = []
    String[] hookEntry = []

    BlackObfuscatorExtension(Project project) {

    }


    @Override
    public String toString() {
        return "BlackObfuscatorExtension{" +
                "enabled=" + enabled +
                ", depth=" + depth +
                ", obfClass=" + Arrays.toString(obfClass) +
                ", blackClass=" + Arrays.toString(blackClass) +
                '}';
    }
}
