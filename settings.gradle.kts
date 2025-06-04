rootProject.name = "books"
include("application")
include("domain")
include("infrastructure")
include("rest-api")
include("infrastructure:persistence")
findProject(":infrastructure:persistence")?.name = "persistence"
include("infrastructure:config")
findProject(":infrastructure:config")?.name = "config"

include("learn")
include("learn")