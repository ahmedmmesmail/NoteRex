# 🦖 NoteRex

> **Your ideas. Your projects. Your system.**

NoteRex is a developer-focused notes and knowledge workspace built
around one simple idea:

**Notes should not stay notes forever.**

Capture an idea quickly, organize it later, develop it into a project,
and keep everything connected in one place.

**Core workflow:**

`Capture → Organize → Develop → Execute`

------------------------------------------------------------------------

## 🎯 Vision

NoteRex is more than a traditional notes app.

A normal note can stay a simple note, but when an idea grows, it can
become a structured project with its own notes, tasks, bugs, resources,
and changelog.

### The signature workflow

``` text
💡 Idea
   ↓
📝 Note
   ↓
📁 Organize
   ↓
🚀 Project
   ↓
✅ Execute
```

### Why NoteRex?

-   Markdown-first notes
-   Offline-first experience
-   Folders for organization
-   Tags for context
-   Projects for active work
-   Note → Project conversion
-   Global search
-   Archive and Trash
-   Import / Export Markdown
-   Local Room database + Firestore sync
-   Data remains portable instead of being locked into one app

------------------------------------------------------------------------

# 🧭 Product Structure

## Main Navigation

The app avoids the traditional three-dot overflow menu as the primary
way to reach important actions.

``` text
┌──────────────────────────────────────┐
│ NoteRex              🗑️  🗃️  ⚙️     │
│                                      │
│ 🔍 Search notes, projects & tags     │
└──────────────────────────────────────┘

        Content Area

┌──────────────────────────────────────┐
│ 📝 Notes  🏷️ Notes  📁 Folders  🚀 Projects │
└──────────────────────────────────────┘

                    ＋
```

### Top Bar

Global actions:

-   NoteRex
-   Trash
-   Archive
-   Settings

### Search

Search is a first-class feature and searches across:

-   Notes
-   Projects
-   Tags
-   Folders

### Bottom Navigation

Core areas:

1.  Notes
2.  Tags
3.  Folders
4.  Projects

`Inbox` is not a bottom-navigation destination. It is part of the Notes
experience.

### FAB

The `+` button is used for creation:

``` text
＋
├── 📝 New Note
└── 🚀 New Project
```

------------------------------------------------------------------------

# 📝 Notes

Notes are the core building block of NoteRex.

A note contains:

``` text
Note
├── ID
├── Title
├── Markdown Content
├── Folder
├── Project
├── Tags
├── Created At
├── Updated At
├── Pinned
├── Archived
├── Deleted
└── Sync State
```

A note can:

-   belong to a folder
-   have multiple tags
-   belong to a project
-   be pinned
-   be archived
-   be moved to Trash
-   be edited offline
-   be exported as Markdown

------------------------------------------------------------------------

# 📥 Inbox

> **Capture now, organize later.**

When creating a note, the user should not be forced to decide where it
belongs immediately.

New notes can start in:

``` text
📥 Inbox
```

Later, the user can:

-   move it to a folder
-   add tags
-   attach it to a project
-   archive it
-   delete it

This keeps capturing ideas fast and frictionless.

------------------------------------------------------------------------

# 📁 Folders

Folders answer:

> **Where is this information organized?**

Example:

``` text
📁 Android
├── Compose
├── Firebase
├── Room
└── Play Store

📁 University
├── Subjects
├── Assignments
└── Graduation Project

📁 Personal
└── Ideas
```

Folders may support nesting:

``` text
Android
└── Projects
    └── DeTauro
```

------------------------------------------------------------------------

# 🏷️ Tags

Tags answer:

> **What is this information about?**

A note can have multiple tags.

Example:

``` text
#android
#compose
#firebase
#idea
#bug
```

### Folder vs Tag vs Project

  Feature      Answers
  ------------ -----------------------
  📁 Folder    Where is it?
  🏷️ Tag       What is it about?
  🚀 Project   What am I working on?

These concepts should remain separate.

------------------------------------------------------------------------

# 🚀 Projects

Projects are **not just folders**.

A project represents active work with structure, progress, and context.

Example:

``` text
🚀 DeTauro
├── Overview
├── 📝 Notes
├── 💡 Ideas
├── ✅ Tasks
├── 🐛 Bugs
├── 🔗 Resources
└── 📜 Changelog
```

A project can contain:

``` text
Project
├── ID
├── Name
├── Description
├── Status
├── Progress
├── Notes
├── Tasks
├── Created At
├── Updated At
└── Sync State
```

Possible statuses:

``` text
IDEA
PLANNING
IN_PROGRESS
ON_HOLD
COMPLETED
ARCHIVED
```

------------------------------------------------------------------------

# 🔄 Note → Project

This is one of NoteRex's signature features.

A simple note can evolve into a project.

Example:

``` text
📝 Expense Tracker App
        ↓
   Convert to Project
        ↓
🚀 Expense Tracker
├── Overview
├── Ideas
├── Tasks
├── Bugs
├── Notes
├── Resources
└── Changelog
```

The original note content should not simply disappear. The conversion
should preserve the user's information while creating the project
structure around it.

------------------------------------------------------------------------

# 📝 Markdown

Markdown is a **core feature**, not merely an export format.

Example:

``` md
# DeTauro

## Ideas

- Improve Xiaomi support
- Add statistics
- Improve translations

## TODO

- [x] Closed testing
- [ ] Add statistics
- [ ] Improve backup
```

The editor should support:

-   Markdown editing
-   Markdown preview
-   Basic formatting
-   Checklists
-   Headings
-   Lists
-   Links
-   Code blocks

### Import / Export

Users should be able to:

``` text
.md file
   ↓
Import
   ↓
NoteRex
```

and:

``` text
NoteRex
   ↓
Export Markdown
   ↓
.md file
```

The goal is portability and reduced vendor lock-in.

------------------------------------------------------------------------

# 📦 Project Export

Eventually, a project can be exported as a Markdown folder:

``` text
DeTauro/
├── README.md
├── notes/
│   ├── ideas.md
│   ├── xiaomi.md
│   └── roadmap.md
└── changelog.md
```

------------------------------------------------------------------------

# 🔍 Search

Search should be global and fast.

``` text
🔍 Search notes, projects & tags
```

Possible results:

``` text
Search: "Firebase"

📝 Firebase Auth Setup
🚀 MoneyWhale
🏷️ #firebase
📁 Android/Firebase
```

The user should be able to open the result directly.

------------------------------------------------------------------------

# 🗃️ Archive

Archive is for information the user wants to keep but does not want in
the active workspace.

``` text
Note
 ↓
Archive
 ↓
Archived
```

Archived notes are not deleted.

They can be restored later.

------------------------------------------------------------------------

# 🗑️ Trash

Deleting a note should normally move it to Trash first.

``` text
Note
 ↓
Delete
 ↓
🗑️ Trash
```

From Trash the user can:

``` text
Restore
   or
Delete Permanently
```

Permanent deletion should be explicit.

------------------------------------------------------------------------

# 🔐 Authentication

Initial flow:

``` text
Open NoteRex
     ↓
   Splash
     ↓
Authentication
     ↓
 Login / Register
     ↓
    Home
```

Login:

``` text
Email + Password
       ↓
Firebase Authentication
       ↓
     Success
       ↓
      Home
```

Authentication is required so user data can be associated with the
correct account for Firestore synchronization.

------------------------------------------------------------------------

# 💾 Offline-First Architecture

Offline support is a core part of NoteRex.

The user should be able to use the important parts of the app without an
internet connection.

### Architecture

``` text
UI
 ↓
ViewModel
 ↓
Repository
 ↓
Room
 ↓
Firestore
```

However, Room is the local source of truth for the UI.

Firestore acts as the remote synchronization layer.

------------------------------------------------------------------------

## Offline Flow

### Online

``` text
User creates/edits note
        ↓
    ViewModel
        ↓
    Repository
        ↓
       Room
        ↓
 UI updates immediately
        ↓
    Firestore
        ↓
     SYNCED
```

### Offline

``` text
User creates/edits note
        ↓
    ViewModel
        ↓
    Repository
        ↓
       Room
        ↓
 UI updates immediately
        ↓
     PENDING
```

When internet returns:

``` text
Internet returns
       ↓
Sync Engine
       ↓
Pending local changes
       ↓
Firestore
       ↓
     SYNCED
```

This synchronization should happen automatically without requiring the
user to manually upload anything.

------------------------------------------------------------------------

# 🔄 Sync State

Instead of relying only on `isSynced`, entities should have an explicit
sync state.

``` text
SYNCED
PENDING
FAILED
```

Example:

``` text
Note
├── ...
└── syncState = PENDING
```

The exact synchronization implementation can evolve as the project
grows.

Conflict resolution can be introduced later if multi-device editing
requires it.

------------------------------------------------------------------------

# 📡 Offline Operations

The following operations should work offline:

-   Create note
-   Edit note
-   Delete note
-   Restore note
-   Move note
-   Add/remove tags
-   Move between folders
-   Archive
-   Create/edit projects
-   Update project tasks

The local database should preserve these changes until they can be
synchronized.

------------------------------------------------------------------------

# 🔥 Firestore

Firestore stores the user's synchronized cloud data.

Conceptually:

``` text
users/
└── {userId}/
    ├── notes/
    ├── folders/
    ├── tags/
    └── projects/
```

The exact Firestore structure can change during implementation.

Important requirements:

-   User data must be isolated by account.
-   Local data should remain usable without internet.
-   Sync should resume automatically.
-   Failed synchronization should be retryable.

------------------------------------------------------------------------

# 🗄️ Room Database

Room is the local persistence layer.

Suggested local entities:

``` text
NoteEntity
FolderEntity
TagEntity
ProjectEntity
ProjectTaskEntity
```

Room should be treated as the local source of truth for the UI.

------------------------------------------------------------------------

# 🏗️ Suggested Architecture

``` text
┌──────────────────────────┐
│           UI             │
│      Jetpack Compose     │
└────────────┬─────────────┘
             ↓
┌──────────────────────────┐
│        ViewModel         │
└────────────┬─────────────┘
             ↓
┌──────────────────────────┐
│       Repository         │
└───────┬───────────┬──────┘
        ↓           ↓
┌─────────────┐  ┌─────────────┐
│    Room     │  │  Firestore  │
│ Local Data  │  │ Cloud Sync  │
└─────────────┘  └─────────────┘
```

------------------------------------------------------------------------

# 🧱 Suggested Project Structure

``` text
NoteRex/
│
├── core/
│   ├── database/
│   ├── markdown/
│   ├── navigation/
│   └── ui/
│
├── data/
│   ├── local/
│   ├── repository/
│   └── model/
│
├── domain/
│   ├── note/
│   ├── folder/
│   ├── project/
│   └── tag/
│
└── feature/
    ├── home/
    ├── notes/
    ├── editor/
    ├── folders/
    ├── projects/
    └── search/
```

This structure can be adjusted as the codebase grows.

------------------------------------------------------------------------

# 🧰 Technology Stack

## Android

-   Kotlin
-   Jetpack Compose
-   Material 3
-   Android Studio

## Local

-   Room
-   Kotlin Coroutines
-   Flow

## Cloud

-   Firebase Authentication
-   Cloud Firestore

## Content

-   Markdown parser/editor

The exact libraries should be chosen during implementation rather than
locking the README to a specific third-party Markdown library too early.

------------------------------------------------------------------------

# 🎨 Brand Direction

## Name

**NoteRex**

`Note + Rex`

The dinosaur represents the brand, while the notebook represents the
product.

### Brand idea

``` text
🧠 Idea
   +
📝 Note
   +
🦖 Rex
   =
NoteRex
```

### Tagline

> **Your ideas. Your projects. Your system.**

Alternative short line:

> **From notes to projects.**

------------------------------------------------------------------------

# 🦖 Visual Identity

The visual direction should be:

-   Green
-   Fresh
-   Vibrant
-   Calm
-   Modern
-   Friendly
-   Professional
-   Developer/productivity focused

NoteRex should **not** reuse DeTauro's green palette.

The NoteRex palette should feel more vibrant and comfortable for long
daily usage.

### Logo direction

The current preferred direction is:

``` text
📓 Notebook
   +
🦖 T-Rex
   +
✏️ Pencil
```

The logo should be:

-   recognizable at small sizes
-   simple enough for an app icon
-   friendly without looking childish
-   usable as an adaptive icon
-   readable without the word "NoteRex"

------------------------------------------------------------------------

# 📱 Adaptive Icon

The logo source should be designed around:

``` text
1024 × 1024 px
```

The final Android launcher icon should use:

-   Foreground layer
-   Background layer

Important:

-   Keep the important dinosaur/notebook/pencil elements inside the safe
    area.
-   Do not put the `NoteRex` wordmark inside the launcher icon.
-   Avoid details too close to the edges.
-   Test the icon with different launcher masks.

------------------------------------------------------------------------

# 🧩 Command Palette

A future productivity feature.

Possible shortcut:

``` text
Ctrl + K
```

Possible commands:

``` text
Create Note
Create Project
Search
Export Markdown
Import Markdown
Move to Folder
Add Tag
Archive
Convert to Project
```

The mobile equivalent can use a dedicated command/search interface.

This is not required for V1.

------------------------------------------------------------------------

# 🧪 Product Storylines

These storylines describe how NoteRex should behave from the user's
perspective.

## 01 --- First Launch

``` text
Open app
 ↓
Splash
 ↓
Login / Register
 ↓
Home
```

## 02 --- Login

``` text
Email + Password
 ↓
Firebase Authentication
 ↓
Home
```

## 03 --- Create Note

``` text
Home
 ↓
+
 ↓
New Note
 ↓
Title + Markdown
 ↓
Save
 ↓
Room
 ↓
Firestore Sync
```

## 04 --- Edit Note

``` text
Open Note
 ↓
Edit
 ↓
Save
 ↓
Room
 ↓
Sync
```

## 05 --- Offline Note

``` text
No Internet
 ↓
Create/Edit
 ↓
Room
 ↓
UI updates
 ↓
PENDING
```

## 06 --- Offline → Online

``` text
PENDING
 ↓
Internet returns
 ↓
Automatic Sync
 ↓
Firestore
 ↓
SYNCED
```

## 07 --- Delete Note

``` text
Note
 ↓
Delete
 ↓
Trash
```

## 08 --- Restore Note

``` text
Trash
 ↓
Restore
 ↓
Notes
```

## 09 --- Permanently Delete

``` text
Trash
 ↓
Delete Permanently
 ↓
Removed
```

## 10 --- Archive Note

``` text
Note
 ↓
Archive
 ↓
Archived
```

## 11 --- Restore Archived Note

``` text
Archive
 ↓
Restore
 ↓
Active Notes
```

## 12 --- Create Folder

``` text
Folders
 ↓
+
 ↓
Folder Name
 ↓
Create
```

## 13 --- Move Note

``` text
Note
 ↓
Move
 ↓
Select Folder
 ↓
Room
 ↓
Sync
```

## 14 --- Create Tag

``` text
Tags
 ↓
+
 ↓
Tag Name
 ↓
Create
```

## 15 --- Tag a Note

``` text
Open Note
 ↓
Add Tag
 ↓
Select Tags
 ↓
Save
```

## 16 --- Filter by Tag

``` text
Tag
 ↓
#android
 ↓
All matching notes/projects
```

## 17 --- Search

``` text
Search
 ↓
Query
 ↓
Notes + Projects + Tags + Folders
 ↓
Open result
```

## 18 --- Create Project

``` text
Projects
 ↓
+
 ↓
New Project
 ↓
Name + Description
 ↓
Project Created
```

## 19 --- Add Note to Project

``` text
Note
 ↓
Project
 ↓
Select Project
 ↓
Note appears inside Project
```

## 20 --- Convert Note → Project

``` text
Note
 ↓
Convert to Project
 ↓
Project Structure
 ↓
Original content preserved
```

## 21 --- Project Tasks

``` text
Project
 ↓
Tasks
 ↓
Create Task
 ↓
TODO
 ↓
Complete
 ↓
DONE
```

## 22 --- Project Bug

``` text
Project
 ↓
Bugs
 ↓
Create Bug
 ↓
Track status
```

## 23 --- Project Resource

``` text
Project
 ↓
Resources
 ↓
Add URL / reference
```

## 24 --- Project Changelog

``` text
Project
 ↓
Changelog
 ↓
Add entry
```

## 25 --- Export Note

``` text
Note
 ↓
Export
 ↓
Markdown
 ↓
.md
```

## 26 --- Import Markdown

``` text
.md
 ↓
Import
 ↓
NoteRex
 ↓
Markdown Note
```

## 27 --- Project Export

``` text
Project
 ↓
Export
 ↓
Markdown Project
 ↓
README.md + notes + changelog
```

## 28 --- Multi-Device Sync

``` text
Device A
 ↓
Room
 ↓
Firestore
 ↓
Device B
 ↓
Room
 ↓
UI
```

## 29 --- Empty Inbox

``` text
Inbox
 ↓
No notes
 ↓
"Nothing here yet."
 ↓
Create Note
```

## 30 --- Search → Project

``` text
Search "DeTauro"
 ↓
Project result
 ↓
Open Project
```

## 31 --- Search → Note

``` text
Search "Xiaomi"
 ↓
Note result
 ↓
Open Note
```

------------------------------------------------------------------------

# 🛣️ Roadmap

## V1 --- Core Product

### Must Have

-   [ ] Authentication
-   [ ] Notes CRUD
-   [ ] Markdown editor
-   [ ] Markdown preview
-   [ ] Room database
-   [ ] Offline-first data flow
-   [ ] Firestore synchronization
-   [ ] Inbox
-   [ ] Folders
-   [ ] Tags
-   [ ] Search
-   [ ] Archive
-   [ ] Trash
-   [ ] Projects
-   [ ] Project tasks
-   [ ] Note → Project
-   [ ] Markdown import
-   [ ] Markdown export
-   [ ] Light / Dark mode

------------------------------------------------------------------------

## V1.1 --- Productivity

-   [ ] Better Markdown editor
-   [ ] Project templates
-   [ ] Reminders
-   [ ] Better search filters
-   [ ] Sorting
-   [ ] Pinned sections
-   [ ] Improved sync status
-   [ ] Better empty states

Possible project templates:

``` text
Empty
Android App
Backend
University Project
AI / ML
Game
```

------------------------------------------------------------------------

## V2 --- Rich Notes

Potential future features:

-   [ ] Images
-   [ ] Attachments
-   [ ] Voice notes
-   [ ] Drawing
-   [ ] Handwriting
-   [ ] OCR
-   [ ] Widgets
-   [ ] Cloud file storage
-   [ ] Version history

These should not be allowed to bloat the initial product.

------------------------------------------------------------------------

## V3 --- Intelligence

Possible future AI features:

-   [ ] AI note summarization
-   [ ] Automatic tagging
-   [ ] Note organization suggestions
-   [ ] Convert idea → project structure
-   [ ] Project planning assistant
-   [ ] Semantic search
-   [ ] AI-powered knowledge connections

AI should be added only after the core NoteRex experience is solid.

------------------------------------------------------------------------

# 🚦 Development Order

``` text
01. Project Setup
02. Authentication
03. Room Database
04. Notes CRUD
05. Markdown Editor + Preview
06. Home + Navigation
07. Inbox
08. Folders
09. Tags
10. Search
11. Archive + Trash
12. Projects
13. Note ↔ Project
14. Sync Infrastructure
15. Firestore Sync
16. Import / Export
17. UI Polish
18. Testing
19. Release
```

### Important implementation principle

Even though Firestore UI integration can be completed later, the
repository/data model should be designed for offline-first
synchronization from the beginning.

Do not build a local-only architecture and try to bolt sync onto it at
the end.

------------------------------------------------------------------------

# 🧠 Product Rules

Keep these rules in mind while developing NoteRex:

### 1. Capture should be fast

The user should be able to write an idea immediately.

### 2. Organization should be flexible

A note can use folders, tags, and projects independently.

### 3. Projects are more than folders

A project represents work, progress, tasks, and context.

### 4. Offline should feel normal

No internet should not mean the app stops working.

### 5. Sync should be invisible

The user should not have to manually think about synchronization.

### 6. Markdown belongs to the product

It should not feel like an afterthought or export-only feature.

### 7. Data should stay portable

Users should be able to get their information back as Markdown.

### 8. V1 should stay focused

Do not add every possible note-taking feature before the core workflow
is excellent.

------------------------------------------------------------------------

# 🧪 Quality Checklist

Before release:

-   [ ] Create note online
-   [ ] Create note offline
-   [ ] Edit note offline
-   [ ] Delete note offline
-   [ ] Restore note
-   [ ] Archive note
-   [ ] Move note between folders
-   [ ] Add/remove tags
-   [ ] Create project
-   [ ] Add note to project
-   [ ] Convert note to project
-   [ ] Search notes
-   [ ] Search projects
-   [ ] Import Markdown
-   [ ] Export Markdown
-   [ ] Reconnect internet and verify automatic sync
-   [ ] Test failed sync and retry
-   [ ] Test logout/login
-   [ ] Test data isolation between accounts
-   [ ] Test different screen sizes
-   [ ] Test dark/light mode
-   [ ] Test adaptive icon
-   [ ] Test app restart while offline
-   [ ] Test app after network restoration

------------------------------------------------------------------------

# 🏁 Definition of Done for V1

NoteRex V1 is ready when a user can:

``` text
Sign Up
  ↓
Login
  ↓
Capture an idea
  ↓
Write it in Markdown
  ↓
Organize it with folders/tags
  ↓
Turn it into a project
  ↓
Add tasks and notes
  ↓
Work completely offline
  ↓
Reconnect
  ↓
Everything syncs automatically
  ↓
Export the information as Markdown
```

If this flow feels fast, reliable, and natural, the core of NoteRex is
working.

------------------------------------------------------------------------

# 🦖 Final Concept

``` text
                NoteRex

        Your ideas.
        Your projects.
        Your system.

              🧠
               ↓
             📝 Note
               ↓
          📁 Organize
               ↓
          🚀 Project
               ↓
           ✅ Execute
```

**NoteRex is where random ideas stop being random notes and start
becoming real work.** 🦖💚
#   N o t e R e x  
 