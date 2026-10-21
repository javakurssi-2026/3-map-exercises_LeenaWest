#!/usr/bin/env bash

output=$(printf "19230\n" | GRADLE_OPTS="-Dfile.encoding=utf-8" ./gradlew --quiet --console plain run 2>&1)

if ! printf '%s' "$output" | grep -qi "onkiniemi"; then
    echo "With postal code 19230, the output should contain \"onkiniemi\""
    echo
    echo "Actual output:"
    printf '%s\n' "$output"
    exit 1
fi
