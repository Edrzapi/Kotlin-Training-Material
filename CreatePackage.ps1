# Set the base directory for the Kotlin project
$baseDir = "C:\Users\edrz\IdeaProjects\KotlinTraining\src"

# Define the packages and their associated class files, skipping 1_datatypes
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

# Loop through each package and file
foreach ($package in $packageStructure.Keys) {
    $packageDir = Join-Path -Path $baseDir -ChildPath $package

    # Format the package name for Kotlin, with backticks around "number_packagename"
    $packageName = "`$package" # Add backticks in the output file content

    foreach ($file in $packageStructure[$package]) {
        $filePath = Join-Path -Path $packageDir -ChildPath $file
        $className = $file -replace '.kt$', '' # Remove the .kt extension to get the class name

        # Define the content with package and class declaration
        $content = @"
package ``$package``

class $className {
}
"@

        # Write the content to the file, overwriting existing content
        Set-Content -Path $filePath -Value $content
        Write-Output "Updated file: $filePath with package `$package and class $className"
    }
}
