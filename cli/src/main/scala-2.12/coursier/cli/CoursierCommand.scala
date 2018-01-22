package coursier.cli

import caseapp.CommandParser
import caseapp.core.help.CommandsHelp

object CoursierCommand {

  val parser =
    CommandParser.nil
      .add("bootstrap", Bootstrap.parser)
      .add("fetch", Fetch.parser)
      .add("launch", Launch.parser)
      .add("resolve", Resolve.parser)
      .add("sparksubmit", SparkSubmit.parser)
      .reverse

  val help =
    CommandsHelp.nil
      .add("bootstrap", Bootstrap)
      .add("fetch", Fetch)
      .add("launch", Launch)
      .add("resolve", Resolve)
      .add("sparksubmit", SparkSubmit)
      .reverse

}
