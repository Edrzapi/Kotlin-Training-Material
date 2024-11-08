# Set the base directory for the Kotlin project
$baseDir = "C:\Users\edrz\IdeaProjects\KotlinTraining\src"

# Define the package structure without 1_datatypes, only folders and file names
$packageStructure = @{
    "2_functions" = @("BasicFunctions.kt", "HigherOrderFunctions.kt", "LambdaExpressions.kt", "InlineFunctions.kt")
    "3_oop" = @("ClassesAndObjects.kt", "Inheritance.kt", "Interfaces.kt", "Polymorphism.kt")
    "4_generics" = @("GenericClasses.kt", "Variance.kt", "GenericFunctions.kt", "ReifiedTypes.kt")
    "5_collections" = @("Lists.kt", "Sets.kt", "Maps.kt", "CollectionFunctions.kt")
    "6_iteration" = @("ForLoops.kt", "WhileLoops.kt", "RangeIteration.kt", "LoopControl.kt")
    "8_file_io" = @("FileReading.kt", "FileWriting.kt", "Serialization.kt", "BufferedIO.kt")
    "9_networking" = @("ApiRequests.kt", "RetrofitSetup.kt", "JsonHandling.kt", "NetworkingErrorHandling.kt")
    "10_coroutines" = @("CoroutinesBasics.kt", "AsyncAwait.kt", "StructuredConcurrency.kt", "Flow.kt")
    "11_extensions" = @("ExtensionFunctions.kt", "ExtensionProperties.kt", "ScopeFunctions.kt", "CustomExtensions.kt")
    "12_reflection" = @("ReflectionBasics.kt", "KClassUsage.kt", "Annotations.kt", "DynamicInvocation.kt")
    "13_tests" = @("UnitTests.kt", "Mocking.kt", "ParameterizedTests.kt", "TestDrivenDevelopment.kt")
}

# Loop through each package to create folders and files
foreach ($package in $packageStructure.Keys) {
    $packageDir = Join-Path -Path $baseDir -ChildPath $package

    # Create the directory if it doesn't exist
    if (!(Test-Path -Path $packageDir)) {
        New-Item -ItemType Directory -Path $packageDir
        Write-Output "Created directory: $packageDir"
    } else {
        Write-Output "Directory already exists: $packageDir"
    }

    # Create each .kt file within the folder
    foreach ($file in $packageStructure[$package]) {
        $filePath = Join-Path -Path $packageDir -ChildPath $file

        # Create the file only if it does not already exist
        if (!(Test-Path -Path $filePath)) {
            New-Item -ItemType File -Path $filePath -Force
            Write-Output "Created file: $filePath"
        } else {
            Write-Output "File already exists: $filePath"
        }
    }
}
