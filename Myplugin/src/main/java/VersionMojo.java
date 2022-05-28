
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "version")
public final class VersionMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    public MavenProject project;

    public void execute() {
        getLog().info("Project version: " + project.getVersion());
    }
}
