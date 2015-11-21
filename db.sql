USE [test1]
GO
/****** Object:  Table [dbo].[usr]    Script Date: 11/21/2015 23:45:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[usr](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[email] [varchar](50) NULL,
 CONSTRAINT [PK_usr] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[usr] ON
INSERT [dbo].[usr] ([id], [name], [email]) VALUES (1, N'user1', NULL)
INSERT [dbo].[usr] ([id], [name], [email]) VALUES (2, N'user2', NULL)
SET IDENTITY_INSERT [dbo].[usr] OFF
