#!/usr/bin/env bash


output=$(printf "tammisaari\n" | GRADLE_OPTS="-Dfile.encoding=utf-8" ./gradlew --quiet --console plain run 2>&1)

if ! printf '%s' "$output" | grep -Eqi ".*10600[^\\d]+10601[^\\d]+10620[^\\d]+10650[^\\d]+10660.*"; then
	echo "With place name \"tammisaari\", the output should contain postal codes 10600...10660 in alphabetical order"
	echo
	echo "Actual output:"
	printf '%s\n' "$output"
	exit 1
fi
