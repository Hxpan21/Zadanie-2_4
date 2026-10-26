---
name: Imported Java environments
description: Avoid redundant legacy Nix packages alongside the Replit Java module.
---

Prefer the configured Java module over duplicate legacy Nix toolchain entries.

**Why:** In this imported environment, legacy GraalVM and Replit editor-tool package entries caused Nix evaluation to fail, leaving Java and Maven unavailable despite the Java module being configured.

**How to apply:** If Java commands are missing and Nix evaluation fails, check for redundant legacy package entries before installing another toolchain. Remove them with the package-management tools.
