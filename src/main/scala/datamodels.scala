import java.util.Date;

case class Task(title: String, dueOn: String, tags: Seq[String] = Seq(), finished: Boolean = false)
